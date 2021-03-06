package practice.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Objects;
public class BankRequestDto
{
    @NotNull
    private int id;
    @NotBlank(message = "name must not be null")
    private String name;
    @NotNull
    private int qnt;

    public BankRequestDto(int id, String name, int qnt)
    {
        this.id = id;
        this.name = name;
        this.qnt = qnt;
    }

    public BankRequestDto()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQnt()
    {
        return qnt;
    }

    public void setQnt(int qnt)
    {
        this.qnt = qnt;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        BankRequestDto that = (BankRequestDto) o;
        return id == that.id && qnt == that.qnt && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, qnt);
    }

    @Override
    public String toString()
    {
        return "BankRequestDto{" +
            "id=" + id +
            " name='" + name + '\'' +
            " qnt=" + qnt +
            '}' +"\n";
    }
}
