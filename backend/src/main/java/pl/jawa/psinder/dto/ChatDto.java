package pl.jawa.psinder.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatDto {

    private long id;
    private long user_Id;
    private String text;
}
