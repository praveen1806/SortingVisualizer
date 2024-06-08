package com.example.sortingVisualizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sortingController {

    @Autowired
    private sortingService sortingService;

    @GetMapping("/")
    public String index() {
        return "index"; // serves index.html
    }

    @GetMapping("/sort")
    @ResponseBody
    public int[] sort(@RequestParam int[] array, @RequestParam String algorithm) {
        return sortingService.sort(array, algorithm);
    }
}
