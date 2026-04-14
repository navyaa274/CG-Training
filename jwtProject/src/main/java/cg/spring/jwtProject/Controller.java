package cg.spring.jwtProject;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
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
    public ResponseEntity<String> deposit(@RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.ok(service.deposit(transactionDTO));
    }

    @PostMapping("/withdraw")
    public ResponseEntity<String> withdraw(@RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.ok(service.withdraw(transactionDTO));
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@RequestBody TransactionDTO transactionDTO ) {
        return ResponseEntity.ok(service.transfer(transactionDTO));
    }

    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.ok(service.changePassword(transactionDTO));
    }

    @PostMapping("/change-info")
    public ResponseEntity<String> changeInfo(@RequestBody Customer customer) {
        return ResponseEntity.ok(service.changeInfo(customer));
    }

    @DeleteMapping("/close")
    public ResponseEntity<String> close(@RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.ok(service.close(transactionDTO));
    }

}
