package cg.spring.jwtProject;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@Valid @RequestBody Customer customer) {
        return ResponseEntity.ok(service.signup(customer));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Customer customer) {
        return ResponseEntity.ok(service.login(customer));
    }

    @GetMapping("/debit-card")
    public ResponseEntity<String> debitCard() {
        return ResponseEntity.ok(service.debitCard());
    }

    @GetMapping("/cheque-book")
    public ResponseEntity<String> chequeBook() {
        return ResponseEntity.ok(service.chequeBook());
    }

    @GetMapping("/cheque-book/issue")
    public ResponseEntity<String> chequeBookIssue() {
        return ResponseEntity.ok(service.chequeBookIssue());
    }

    @GetMapping("/pass-book")
    public ResponseEntity<String> passBook() {
        return ResponseEntity.ok(service.passBook());
    }

    @GetMapping("/pass-book/issue")
    public ResponseEntity<String> passBookIssue() {
        return ResponseEntity.ok(service.passBookIssue());
    }

    @GetMapping("/balance")
    public ResponseEntity<String> balance() {
        return ResponseEntity.ok(service.balance());
    }

    @PostMapping("/deposit")
    public ResponseEntity<String> deposit() {

    }

    @PostMapping("/withdraw")
    public ResponseEntity<String> withdraw(@RequestBody Customer customer) {

    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@RequestBody Customer customer) {

    }

    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestBody Customer customer) {

    }

    @PostMapping("/change-info")
    public ResponseEntity<String> changeInfo(@RequestBody Customer customer) {

    }

    @DeleteMapping("/close")
    public ResponseEntity<String> close(@RequestBody Customer customer) {}

}
