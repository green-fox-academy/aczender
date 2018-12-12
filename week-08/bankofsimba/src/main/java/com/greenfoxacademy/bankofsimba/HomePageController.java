package com.greenfoxacademy.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomePageController {

    List<BankAccount> bankAccounts;

    public HomePageController(List bankAccount) {
        this.bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Simba", 2000., "lion", true));
        bankAccounts.add(new BankAccount("Nala", 200., "lion", false));
        bankAccounts.add(new BankAccount("Scar", 450., "lion", false));
        bankAccounts.add(new BankAccount("Rafiki", 920., "mandrill", false));
        bankAccounts.add(new BankAccount("Timon", 1., "meerkat", false));
    }

    @GetMapping("/show")   //@GetMapping annotation ensures that HTTP GET requests to /show are mapped to the show() method.
    public String home(Model model) {
        model.addAttribute("accounts", bankAccounts);
        return "homepage";
    }

    @RequestMapping("/htmlception")
    public String ception(Model model) {
        model.addAttribute("text", "<em>HTML</em>");
        model.addAttribute("formatted", "<b>Enjoy yourself!</b>");
        return "htmlception";
    }

    @PostMapping("/raise")
    public String raiseBalance(@RequestParam String buttonName) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getName().toLowerCase().equals(buttonName.toLowerCase()) && (bankAccount.getKing())) {
                bankAccount.setBalance(bankAccount.getBalance() + 10);
            } else if (bankAccount.getName().toLowerCase().equals(buttonName.toLowerCase())) {
                bankAccount.setBalance(bankAccount.getBalance() + 100);
            }

        }
        return "redirect:/show";
    }


    @GetMapping(path ="/accounts/add")
    public String addAccountForm(Model model, @ModelAttribute(name = "account") BankAccount bankAccount) {
        model.addAttribute("account", bankAccount);
        return "addaccounts";
    }

    @PostMapping(path = "/accounts/add")
    public String addAccount(@ModelAttribute(name = "account") BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
        return "redirect:/show";
    }


}