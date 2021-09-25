package jp.example.class_interface.interface_than_abstruct.skeletan;

class Concrete extends AbstractInterface {

    @Override
    public void start() {
        System.out.println("開始");
    }

    @Override
    public void end() {
        System.out.println("終了");
    }

}
