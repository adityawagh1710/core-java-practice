package com.practice.superior.example;

public class GraphicsCard extends Component {
    String series;

    GraphicsCard(String brand, String series) {
        super(brand);  // Passes the brand up to the Component constructor
        this.series = series; // Sets the series for this specific GraphicsCard
    }

    public static void main(String[] args) {
        GraphicsCard myGPU = new GraphicsCard("NVIDIA", "GeForce GTX 1650");
        System.out.println("Brand: " + myGPU.brand + " Series: " + myGPU.series);
    }
}
