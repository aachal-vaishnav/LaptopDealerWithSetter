package com.example.LaptopDealerWithSetter;

public class MicrosoftLaptop implements LaptopBrand{
    Processors processors;

//    public MicrosoftLaptop(Processors processors){
//        this.processors = processors;
//    }
    public void setProcessors(Processors processors) {
        this.processors = processors;
    }

    @Override
    public void showDetails() {
        System.out.println("You have selected Microsoft laptop"+processors.showProcessorDetail());
    }
}
