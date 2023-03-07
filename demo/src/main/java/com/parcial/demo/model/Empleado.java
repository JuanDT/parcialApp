package com.parcial.demo.model;

public class Empleado {

    @NotBlank(message = "El id es obligatorio")
    private String id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El nombre es obligatorio")
    @Email(message = "Ingrese un correo electrónico válido")
    private String correo;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    @NotBlank(message = "El teléfono es obligatorio")
    @Size(min = 10, message = "El mensaje debe tener al menos 10 caracteres")
    private String telefono;

}
