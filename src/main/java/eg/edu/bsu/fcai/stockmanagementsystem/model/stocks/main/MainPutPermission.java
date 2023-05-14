package eg.edu.bsu.fcai.stockmanagementsystem.model.stocks.main;

import eg.edu.bsu.fcai.stockmanagementsystem.model.entities.Type;
import eg.edu.bsu.fcai.stockmanagementsystem.model.entities.Stock;
import eg.edu.bsu.fcai.stockmanagementsystem.model.entities.ApplicationUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MainPutPermission {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private ApplicationUser from;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Stock to;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Type type;
    @ManyToOne
    @JoinColumn(nullable = false)
    private ApplicationUser writer;
    @ManyToOne
    @JoinColumn(nullable = false)
    private ApplicationUser stockAdmin;
    private Integer groupNumber;
    private Date date;
    private Double price;
    private String note;
}
