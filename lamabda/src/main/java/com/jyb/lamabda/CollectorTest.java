package com.jyb.lamabda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Yubing on 2017/10/4.
 */
public class CollectorTest {
    
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User(1,"xiao","mail@mail.com"));
        list.add(new User(2,"xiao1","mail@mail.com"));
        list.add(new User(3,"xiao2","mail2@mail.com"));
        String result = list.stream().map(User::getUserName)
                .peek(l->System.out.println("peek value:"+l)) //记录中间值
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result);
        System.out.println("---->>>>>>>>>>>>>>>>>>>>----");
        long start = System.currentTimeMillis();
        Map<String,List<User>> map = list.stream()
                .collect(Collectors.groupingBy(User::getEmail,Collectors.mapping(u->u,Collectors.toList())));
        long begin = System.currentTimeMillis();
        System.out.println("stream date = [" +(begin- start) + "]");
        //并行流操作
        list.parallelStream()
                .collect(Collectors.groupingBy(User::getEmail,Collectors.mapping(u->u,Collectors.toList())));
        long end = System.currentTimeMillis();
        System.out.println("parallelStream date = [" +(end- begin) + "]");


    }
}
