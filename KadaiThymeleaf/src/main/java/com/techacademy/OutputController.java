package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    // クラス名: OutputController
    // メソッド名: postOutput
    // 処理内容: 入力画面から入力値を受け取って、出力画面を表示する
    @PostMapping("/output")
    public String postOutput(
            // 入力フォームの name="inputValue" の値を受け取る
            @RequestParam(name = "inputValue") String inputValue,
            Model model) {

        // 受け取った入力値を Model に追加する
        model.addAttribute("inputData", inputValue);

        // output.html テンプレートを返す
        return "output";
    }
}