package com.yswsoft.leetcode.o1;

import java.util.List;

/**
 * Description: <br>
 * Copyright: Copyright (c) 2016<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yushengwei on 2020/1/2 20:02<br>
 */
public class Mian {
    //把数组中的 0 移到末尾 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

    public static void listMove0End(List<Integer> list){
        int zero = 0;
        for (int i=0;i<list.size();i++){
            if(zero == list.get(i)){
                list.add(0);
            }
        }

    }


}


