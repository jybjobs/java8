package com.jyb.lamabda;

/**
 * Created by Yubing on 2017/10/3.
 * java8 函数式编程学习系类
 *
 */

import org.junit.Assert;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 对核心类库的改进主要包括集合类的 API 和新引入的流 （Stream）。
 * 流使程序员得以站在更高的抽象层次上对集合进行操作
 * Stream 是用函数式编程方式在集合类上进行复杂操作的工具。
 */

public class StreamTest {

    public static void main(String[] args) {

        //filter : 该模式的核心思想是保留 Stream 中的一些元素，而过滤掉其他的
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("dd");
        list.add("ee");
        long i =list.stream().filter(l->l.equals("dd")).count();
        System.out.println("list aa count = "+i);

        list.forEach(s-> System.out.println(s));//遍历

        /**
         * 判断一个操作是惰性求值还是及早求值很简单：只需看它的返回值。如果返回值是 Stream， 那么是惰性求值；
         * 如果返回值是另一个值或为空，那么就是及早求值。使用这些操作的理 想方式就是形成一个惰性求值的链，
         * 最后用一个及早求值的操作返回想要的结果，这正是 它的合理之处。
         */
        //只过滤，不计数
        list.stream().filter(l->{
            System.out.println(l);//使用了惰性求值，该段不输出。
            return l.equals("dd");
        });

         i =list.stream().filter(l->{
            System.out.println(l); //会输出
           return l.equals("dd");
        }).count();
        System.out.println("list aa count = "+i);

        List<String> lists = list.stream().filter(l-> l.equals("dd")).collect(Collectors.toList());
        System.out.println("list  = "+lists);

        //collect(toList()) 方法由 Stream 里的值生成一个列表，是一个及早求值操作。
        lists =  Stream.of("aa","bb","cc").collect(Collectors.toList());
       Assert.assertEquals(Arrays.asList("aa","bb","cc"),lists);

       //如果有一个函数可以将一种类型的值转换成另外一种类型，map 操作就可以 使用该函数，将一个流中的值转换成一个新的流。
        List<String> collected = Stream.of("aa","bb","cc")
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        Assert.assertEquals(Arrays.asList("AA","BB","CC"),collected);
        List<Integer> count = Stream.of("aa", "bbb", "cc")
                .map(s -> s.length()) //可以是不同的类型
                .collect(Collectors.toList());
        System.out.println(count);

        //flatMap: 方法可用 Stream 替换值，然后将多个 Stream 连接成一个 Stream
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), together);

        //max 、 min 获取最大值 和 最小值
        String min = Stream.of("aa", "bbb", "cccc")
                .min(Comparator.comparing(s->s.length()))
                .get();
        System.out.println("min :"+min);

        String max = Stream.of("aa", "bbb", "cccc")
                .max(Comparator.comparing(s->s.length()))
                .get();
        System.out.println("max :"+max);

        //reduce : 求和
        int num = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
        Assert.assertEquals(6, num);

    }



}
