package controller;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.account.Account;
import controller.AccountService;


@Controller
public class ApplicationController {

	 @RequestMapping("")
	 private AccountService accountService;
	 @Autowired
	    public AccountController(AccountService accountService) {
	        this.accountService = accountService;
	    }

	    @RequestMapping(path = "/accounts")
	    public ResponseEntity getUserAccount(@RequestParam String username) throws Exception {
	        return Optional.ofNullable(accountService.getUserAccounts(username))
	                .map(a -> new ResponseEntity<List<Account>>(a, HttpStatus.OK))
	                .orElseThrow(() -> new Exception("Accounts for user do not exist"));
	    }
	}


