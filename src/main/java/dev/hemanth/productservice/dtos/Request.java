package dev.hemanth.productservice.dtos;

import dev.hemanth.productservice.security.JwtObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request<T> {
    T userPayload;
    JwtObject authPayload;
}
