package hu.nive.ujratervezes.zarovizsga.housecup;


import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class HouseCup {

    private JdbcTemplate jdbcTemplate;

    public HouseCup(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public int getPointsOfHouse(String house) {
        String sql = "SELECT `points_earned` FROM `house_points` WHERE `house_name` = ?";
        List<Integer> points = jdbcTemplate.query(sql,
                new Object[]{house}, (rs, i) -> rs.getInt(1));
        return points.stream().mapToInt(Integer::intValue).sum();
    }
}
