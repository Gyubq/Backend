package org.scoula.board.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Slf4j

public class BoardController {
    private final BoardService service;

    @GetMapping("")
    public ResponseEntity<List<BoardDTO>> getList() {
    //       return service.getList();  옛날방식
        return ResponseEntity.ok(service.getList());
    }

    @GetMapping("/{no}")
    public ResponseEntity<BoardDTO> get(@PathVariable Long no) {
        //       return service.getList();  옛날방식
        return ResponseEntity.ok(service.get(no));
    }

    @PostMapping("")
    public ResponseEntity<BoardDTO> create(@RequestBody BoardDTO board) {
        return ResponseEntity.ok(service.create(board));
    }

    @PutMapping("{no}")
    public ResponseEntity<BoardDTO> update(@PathVariable("no") int no, @RequestBody BoardDTO board) {
        return ResponseEntity.ok(service.update(board));
    }
    @DeleteMapping("{no}")
    public ResponseEntity<?> delete(@PathVariable Long no) {

//        return ResponseEntity.ok(service.delete(no));

        // 위 아래 둘중하나 사용가능 어떻게하던 .

        service.delete(no);
        return ResponseEntity.ok().build();
    }
}

