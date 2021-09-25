package jp.example.class_interface.interface_than_abstruct.interface_default;

class Concrete implements ImplSupport {

    @Override
    public void start() {
        System.out.println("開始");
    }

    @Override
    public void end() {
        System.out.println("終了");
    }

}
