package com.example.LaptopDealerWithSetter;

public class Dell implements LaptopBrand{
    Processors processors;

//    public Dell(Processors processors){
//        this.processors = processors;
//    }

    public void setProcessors(Processors processors) {
        this.processors = processors;
    }

    @Override
    public void showDetails() {
        System.out.println("You Have selected dell laptop"+processors.showProcessorDetail());
    }
}
