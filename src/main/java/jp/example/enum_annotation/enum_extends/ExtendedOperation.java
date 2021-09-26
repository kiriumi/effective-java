package jp.example.enum_annotation.enum_extends;

enum ExtendedOperation implements Operation {

    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },

    DEVIDE {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

}
