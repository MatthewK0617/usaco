class cookies {
    public static void main(String[] args) {
        int n = 5;

        Cookie[] cookies = new Cookie[n];
        cookies[0] = new Cookie(5, 5);
        cookies[1] = new Cookie(2, 3);
        cookies[2] = new Cookie(3, 1);
        cookies[3] = new Cookie(4, 4);
        cookies[4] = new Cookie(1, 2);


        System.out.println(Arrays.toString(cookies));
        Arrays.sort(cookies);
        System.out.println(Arrays.toString(cookies));
    }
}

class Cookie implements Comparable<Cookie> {
    int sweetness, cnt;
    Cookie(int s, int c) {
        this.sweetness = s;
        this.cnt = c;
    }
    @Override
    public String toString() {
        return "(" + sweetness + ", " + cnt + ")";
    }

    @Override
    public int compareTo(Cookie o) {
        return o.sweetness - this.sweetness;
    }

}