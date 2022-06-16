package main.java.app.pojo;

public class CreateTaskItems {
    private String quantity;

    private String notes;

    private String price;

    private String imageUrl;

    private String name;

    private String id;

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public String getNotes ()
    {
        return notes;
    }

    public void setNotes (String notes)
    {
        this.notes = notes;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }
}
