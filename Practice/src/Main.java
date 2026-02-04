import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
    }

    static long cross(Point o, Point a, Point b) {
        // (a - o) x (b - o)
        return (long)(a.x - o.x) * (b.y - o.y) - (long)(a.y - o.y) * (b.x - o.x);
    }

    static List<Point> lowerHull(List<Point> pts) {
        // pts must be sorted by (x, y)
        List<Point> lower = new ArrayList<>();
        for (Point p : pts) {
            while (lower.size() >= 2 &&
                    cross(lower.get(lower.size() - 2), lower.get(lower.size() - 1), p) <= 0) {
                lower.remove(lower.size() - 1);
            }
            lower.add(p);
        }
        return lower; // leftmost -> rightmost
    }

    static double polylineLength(List<Point> chain) {
        double len = 0.0;
        for (int i = 0; i + 1 < chain.size(); i++) {
            int dx = chain.get(i + 1).x - chain.get(i).x;
            int dy = chain.get(i + 1).y - chain.get(i).y;
            len += Math.hypot(dx, dy);
        }
        return len;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        Integer nObj = fs.nextInt();
        if (nObj == null) return;
        int n = nObj;
        List<Point> pts = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Integer xi = fs.nextInt();
            Integer yi = fs.nextInt();
            if (xi == null || yi == null) return;
            pts.add(new Point(xi, yi));
        }

        // Sort by x then y
        pts.sort((p1, p2) -> p1.x != p2.x ? Integer.compare(p1.x, p2.x)
                : Integer.compare(p1.y, p2.y));

        // Deduplicate
        List<Point> uniq = new ArrayList<>();
        Point prev = null;
        for (Point p : pts) {
            if (prev == null || p.x != prev.x || p.y != prev.y) {
                uniq.add(p);
                prev = p;
            }
        }

        if (uniq.size() <= 1) {
            System.out.println(0);
            return;
        }

        // Build lower convex hull (bowl)
        List<Point> lower = lowerHull(uniq);

        // Length of open polyline
        double length = polylineLength(lower);

        // Round to nearest integer with 0.5 up
        int ans = new BigDecimal(length).setScale(0, RoundingMode.HALF_UP).intValue();

        System.out.println(ans);
    }

    // Fast scanner
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        Integer nextInt() throws IOException {
            int c, s = 1, x = 0;
            do { c = read(); if (c == -1) return null; } while (c <= ' ');
            if (c == '-') { s = -1; c = read(); }
            for (; c > ' '; c = read()) x = x * 10 + (c - '0');
            return x * s;
        }
    }
}
