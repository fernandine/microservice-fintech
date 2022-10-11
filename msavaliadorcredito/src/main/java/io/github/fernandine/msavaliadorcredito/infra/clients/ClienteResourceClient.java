package io.github.fernandine.msavaliadorcredito.infra.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://localhost:8080", path = "/clientes")
public interface ClienteResourceClient {
}
