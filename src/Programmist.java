public  class Programmist extends Employees implements CodWritable{
    public Programmist(String name) {
        super(name);
    }
    @Override
    public void writeCod() {
        System.out.println("Пишу код");

    }
}

