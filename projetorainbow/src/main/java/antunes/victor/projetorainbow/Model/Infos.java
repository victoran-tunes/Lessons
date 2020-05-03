package antunes.victor.projetorainbow.Model;

import lombok.*;

    /**
     @author Victor
     @since 02/05/2020
     @version rainbowsix exemplo 1.0
     */

    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public class Infos {
        @Getter @Setter
        private String name;
        @Getter @Setter
        private String armor;
        @Getter @Setter
        private String speed;
        @Getter @Setter
        private String skill;

    }

