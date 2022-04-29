package com.shop.controller;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafExController {
    @RequestMapping(value = "/ex01", method = RequestMethod.GET)
    public String thymeleafExample01(Model model) {
        model.addAttribute("data", "타임리프 예제");
        return "example/thymeleafEx01";
    }

    @RequestMapping(value="/ex02", method = RequestMethod.GET)
    public String thymeleafExample02(Model model) {
        ItemDto itemDto= new ItemDto();
        itemDto.setItemDetail("상품 상세 설명");
        itemDto.setItemNm("테스트 상품1");
        itemDto.setPrice(10000);
        itemDto.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto", itemDto);
        return "example/thymeleafEx02";
    }
    @RequestMapping(value="/ex03", method = RequestMethod.GET)
    public String thymeleafExample03(Model model) {
        itemDtoList(model);
        return "example/thymeleafEx03";
    }

    @RequestMapping(value="/ex04", method = RequestMethod.GET)
    public String thymeleafExample04(Model model) {
        itemDtoList(model);
        return "example/thymeleafEx04";
    }

    private void itemDtoList(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();

        for(int i=1; i<=10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명" + i);
            itemDto.setItemNm("테스트 상품" + i);
            itemDto.setPrice(1000*i);
            itemDto.setRegTime(LocalDateTime.now());

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);
    }

    @RequestMapping(value="/ex05", method = RequestMethod.GET)
    public String thymeleafExample05() {
        return "example/thymeleafEx05";
    }

    @RequestMapping(value = "/ex06", method = RequestMethod.GET)
    public String thymeleaf06(String param1, String param2, Model model) {
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
//        System.out.println(param1 + param2);
        return "example/thymeleafEx06";
    }

    @RequestMapping(value = "/ex07", method = RequestMethod.GET)
    public String thymeleafExample07() {
        return "example/thymeleafEx07";
    }
}
