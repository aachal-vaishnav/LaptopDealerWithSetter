package com.example.LaptopDealerWithSetter;

public class MacBook implements LaptopBrand{
    Processors processors;

//    public MacBook(Processors processors){
//        this.processors = processors;
//    }
      public void setProcessors(Processors processors) {
          this.processors = processors;
      }

    @Override
    public void showDetails() {
        System.out.println("You have selected MacBook"+processors.showProcessorDetail());
    }
}
