package com.company.StackQueueKunal;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int val) {
        if(this.isFull()){
            int[] newArray=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                newArray[i] = data[i];
            }
                data=newArray;
        }
        return super.push(val);
    }
}
