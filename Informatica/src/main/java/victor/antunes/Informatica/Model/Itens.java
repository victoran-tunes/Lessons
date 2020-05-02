package victor.antunes.Informatica.Model;

import lombok.*;
/**
 @author Victor Antunes
 @since 01/05/2020 21:14
 @version Exemplo 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Itens {
    @Getter @Setter
    private String Name;
    @Getter @Setter
    private String Feature;
    }
