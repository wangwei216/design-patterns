package com.suanfa;

import java.util.*;

public class huichangfenpei_homework {

    public static void main(String[] args) {

        Interval interval1 = new Interval(0, 5);
        Interval interval2 = new Interval(5, 10);
        Interval interval3 = new Interval(15, 20);
        Interval interval4 = new Interval(3, 4);

        List<Interval> intervalList = new ArrayList<Interval>();
        intervalList.add(interval1);
        intervalList.add(interval2);
        intervalList.add(interval3);
        intervalList.add(interval4);
        System.out.println(canAttendMeetings(intervalList));
    }


    public static boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return true;
        }
        sortIntervals(intervals);
        int max = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < max) {
                return false;
            } else {
                max = intervals.get(i).end;
            }
        }
        return true;
    }

    public static void sortIntervals(List<Interval> intervals) {
        Map<String, Interval> intervalMap = new HashMap<String, Interval>();
        for (Interval interval : intervals) {
            intervalMap.put(interval.start + interval.end + "", interval);
        }

        for (int i = 0; i < intervals.size(); i++) {
            int minIndex = i;
            for (int j = i; j < intervals.size(); j++) {
                if (intervals.get(j).start < intervals.get(minIndex).start) {
                    minIndex = j;
                }
            }
            //交换两个位置
            if (minIndex != i) {
                Interval interval = intervals.get(i);
                intervals.set(i, intervals.get(minIndex));
                intervals.set(minIndex, interval);
            }

        }


           System.out.println("这个是排序之后的间隔时间对象顺序！");
           System.out.println(intervals.toString());


    }

    static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

}
