package com.beatorija.getafe.itcf062_2025_ws_hello_world.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public record Saludo(Long id, String message) {

}
