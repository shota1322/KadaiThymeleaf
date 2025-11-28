package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    // クラス名: InputController
    // メソッド名: getInput
    // 処理内容: 入力画面の初期表示をする
    @GetMapping("/input")
    public String getInput(
            // URLパラメータ 'previous' を受け取る。値がない場合は null
            @RequestParam(name = "previous", required = false) String previousValue,
            Model model) {

        // previousパラメータに値が設定されていたらModelに追加する
        if (previousValue != null) {
            model.addAttribute("previousValue", previousValue);
        }

        // input.html テンプレートを返す
        return "input";
    }
}