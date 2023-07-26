package th.co.bell.demo.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.co.bell.demo.request.DemoRequest;
import th.co.bell.demo.service.DemoService;

@RestController
public class DemoController {

    @Setter(onMethod_ = @Autowired)
    private DemoService demoService;

    @PostMapping("/create")
    public ResponseEntity<Boolean> create(
            @RequestBody DemoRequest demoRequest
    ) {
        boolean isSuccess = demoService.createNewUser(demoRequest);
        return ResponseEntity.ok(isSuccess);
    }

    @GetMapping("/read")
    public ResponseEntity<String> read() {
        return ResponseEntity.ok("Hello demo");
    }

}
