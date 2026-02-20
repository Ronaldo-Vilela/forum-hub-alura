package br.com.forumhub.service;

import br.com.forumhub.dto.*;
import br.com.forumhub.model.Topico;
import br.com.forumhub.repository.TopicoRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TopicoService {

    private final TopicoRepository repository;

    public TopicoService(TopicoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public TopicoResponseDTO criar(TopicoCadastroDTO dto) {

        if (repository.existsByTituloAndMensagem(dto.titulo(), dto.mensagem())) {
            throw new RuntimeException("Já existe um tópico com esse título e mensagem.");
        }

        Topico topico = new Topico();
        topico.setTitulo(dto.titulo());
        topico.setMensagem(dto.mensagem());
        topico.setAutor(dto.autor());
        topico.setCurso(dto.curso());
        topico.setDataCriacao(LocalDateTime.now());

        repository.save(topico);

        return new TopicoResponseDTO(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getAutor(),
                topico.getCurso(),
                topico.getDataCriacao()
        );

    }

    public List<Topico> listar() {
        return repository.findAll();
    }

    public TopicoResponseDTO buscarPorId(Long id) {
        Topico topico = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado"));

        return new TopicoResponseDTO(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getAutor(),
                topico.getCurso(),
                topico.getDataCriacao()
        );
    }

    @Transactional
    public TopicoResponseDTO atualizar(Long id, TopicoAtualizacaoDTO dto) {

        Topico topico = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado"));

        topico.setTitulo(dto.titulo());
        topico.setMensagem(dto.mensagem());
        topico.setCurso(dto.curso());

        return new TopicoResponseDTO(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getAutor(),
                topico.getCurso(),
                topico.getDataCriacao()
        );
    }

    @Transactional
    public void deletar(Long id) {

        Topico topico = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado"));

        repository.delete(topico);
    }
}