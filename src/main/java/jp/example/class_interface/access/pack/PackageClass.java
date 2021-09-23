package jp.example.class_interface.access.pack;

class PackageClass {

    public String publicField = "public";

    String packageField = "パッケージ・プライベート";

    protected String protectedField = "protected";

    private final String privateField = "private";

    public void publicMethod() {
    }

    void packageMethod() {
    }

    protected void protectedMethod() {
    }

    private void privateMethod() {
    }

    public class PublicInnerClass {

        public String innerPublicField;

        String innerPackageField;

        protected String innerProtectedField;

        private String innerPrivateField;

        public void innerPublicMethod() {
        }

        void innerPackageMethod() {
        }

        protected void innerProtectedMethod() {
        }

        private void innerPrivateMethod() {
        }

    }

    class PackageInnerClass {

        public String innerPublicField;

        String innerPackageField;

        protected String innerProtectedField;

        private String innerPrivateField;

        public void innerPublicMethod() {
        }

        void innerPackageMethod() {
        }

        protected void innerProtectedMethod() {
        }

        private void innerPrivateMethod() {
        }

    }

    private class PrivateInnerClass {

        public String INNER_PUBLIC_FIELD;

        String innerPackageField;

        protected String innerProtectedField;

        private String innerPrivateField;

        void innerPackageMethod() {
        }

        protected void innerProtectedMethod() {
        }

        private void innerPrivateMethod() {
        }

    }
}
