package ru.ot.social.db;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedJdbcTemplate;

    public List<UserDb> finAll() {
        String sql = "select * from \"user\"";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(UserDb.class));
    }

    public UserDb findById(String id) {
        String sql = "select * from \"user\" where id = :id";

        return namedJdbcTemplate.queryForObject(
                sql, new MapSqlParameterSource("id", id), new BeanPropertyRowMapper<>(UserDb.class));
    }

    public void save(UserDb userDb) {
        String sql = "INSERT INTO \"user\" (" +
                "first_name, second_name, birthdate, biography, city, password)\n" +
                "VALUES (:firstName, :secondName, :birthdate, :biography, :city, :password);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        SqlParameterSource params = new BeanPropertySqlParameterSource(userDb);

        namedJdbcTemplate.update(sql, params, keyHolder, new String[]{"id"});

        userDb.setId(keyHolder.getKeys().get("id").toString());
    }
}
