
class Container<T> {
        T data;

        void showType() {
                System.out.println(data.getClass().getName());
        }
}

class Problem {

        public static void main(String[] args) {
                Container<Integer> obj_1 = new Container<>();
                obj_1.data = 1;
                obj_1.showType();

                Container<Double> obj_2 = new Container<>();
                obj_2.data = 1.1;
                obj_2.showType();
        }
}