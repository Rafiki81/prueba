package com.rafiki.prueba.services;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BinaryService {


    public Object shortList(List<Integer> list) {
        return list.stream().sorted(Comparator.comparingInt(Integer::bitCount).reversed().thenComparing(Integer::intValue))
                .collect(Collectors.toList());
    }
}
