package edu.sharif.web.assignment1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class MainController {
    @GetMapping("/sum/{num1}/{num2}")
    public String add(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        try {
            int operand1 = Integer.parseInt(num1);
            int operand2 = Integer.parseInt(num2);
            int result = operand1 + operand2;
            return String.format("%d + %d = %d", operand1, operand2, result);
        } catch (NumberFormatException e) {
            return "Invalid URL";
        }
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public String subtract(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        try {
            int operand1 = Integer.parseInt(num1);
            int operand2 = Integer.parseInt(num2);
            int result = operand1 - operand2;
            return String.format("%d - %d = %d", operand1, operand2, result);
        } catch (NumberFormatException e) {
            return "Invalid URL";
        }
    }


    @GetMapping("/mult/{num1}/{num2}")
    public String multiply(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        try {
            int operand1 = Integer.parseInt(num1);
            int operand2 = Integer.parseInt(num2);
            int result = operand1 * operand2;
            return String.format("%d * %d = %d", operand1, operand2, result);
        } catch (NumberFormatException e) {
            return "Invalid URL";
        }
    }

    @GetMapping("/div/{num1}/{num2}")
    public String divide(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        try {
            int operand1 = Integer.parseInt(num1);
            int operand2 = Integer.parseInt(num2);
            float result = (float) operand1 / operand2;
            return String.format("%d / %d = %f", operand1, operand2, result);
        } catch (NumberFormatException | ArithmeticException e) {
            return "Invalid URL";
        }
    }
}
