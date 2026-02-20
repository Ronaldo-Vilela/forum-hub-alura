package br.com.forumhub.controller;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import br.com.forumhub.dto.*;
import br.com.forumhub.model.Topico;
import br.com.forumhub.service.TopicoService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Tópicos", description = "Operações relacionadas aos tópicos do fórum")
@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoService service;

    public TopicoController(TopicoService service) {
        this.service = service;
    }

    @Operation(summary = "Criar um novo tópico")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tópico criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos")
    })
    @PostMapping
    public TopicoResponseDTO criar(@RequestBody @Valid TopicoCadastroDTO dto) {
        return service.criar(dto);
    }

    @Operation(summary = "Listar todos os tópicos")
    @GetMapping
    public List<Topico> listar() {
        return service.listar();
    }

    @Operation(summary = "Buscar tópico por ID")
    @ApiResponse(responseCode = "404", description = "Tópico não encontrado")
    @GetMapping("/{id}")
    public TopicoResponseDTO buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @Operation(summary = "Atualizar tópico")
    @PutMapping("/{id}")
    public TopicoResponseDTO atualizar(
            @PathVariable Long id,
            @RequestBody @Valid TopicoAtualizacaoDTO dto) {

        return service.atualizar(id, dto);
    }

    @Operation(summary = "Excluir tópico")
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}