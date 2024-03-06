package br.com.rhfactor.sampledockerarch;


import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class DefaultMessage {

    private String message;


}
