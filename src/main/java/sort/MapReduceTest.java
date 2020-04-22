package sort;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;

/**
 * 快速求n个点距离最近点两个点
 */
public class MapReduceTest {
    public static void main(String[] args) {
        List<Point> points = Lists.newArrayList(new Point(1,2),new Point(1,3),new Point(1,4),new Point(5,9),new Point(2,5));
        nearlyPoints(points,0,points.size()-1);
        points.forEach(point -> {
            System.out.println(point.toString());
        });
    }


    public static void nearlyPoints(List<Point> points,int start,int end){
        if(start >= end){
            return;
        }
        int p = start;
        int q = end;
        int mid = (end + start)/2;
        nearlyPoints(points,p,mid);
        nearlyPoints(points,mid+1,q);
        mergePoints(points,p,mid,q);
    }

    public static void mergePoints(List<Point> points,int p,int mid,int q){
        LinkedList<Point> results = Lists.newLinkedList();
        int low = p;
        int midd = mid + 1;
        int high = q;
        while (low <= mid && midd <= high){
            if(points.get(low).getDistance() < points.get(midd).getDistance()){
                results.add(points.get(low++));
            }else if(points.get(low).getDistance() == points.get(midd).getDistance()){
                results.add(points.get(low++));
                results.add(points.get(midd++));
            }else if (points.get(low).getDistance() > points.get(midd).getDistance()){
                results.add(points.get(midd++));
            }
        }
        while (low <= mid){
            results.add(points.get(low++));
        }
        while (midd <= q){
            results.add(points.get(midd++));
        }
        for (int i = 0; i < results.size(); i++) {
            points.set(p+i,results.get(i));
        }
    }


    static class Point{
         int x;
         int y;

        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }

        public int getDistance(){
            return this.x + this.y;
        }

        @Override
        public String toString() {
            return "x:" + x + ", y:" + y;
        }
    }
}
