package jp.example.enum_annotation.enum_extends;

enum BasicOperation implements Operation {

    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },

    MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    };

}
