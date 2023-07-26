package th.co.bell.demo.request;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DemoRequest implements Serializable {

    private String username;
    private String password;
    private String email;
}
