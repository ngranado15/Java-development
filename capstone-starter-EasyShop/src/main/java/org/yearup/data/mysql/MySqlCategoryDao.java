package org.yearup.data.mysql;

import org.springframework.stereotype.Component;
import org.yearup.data.CategoryDao;
import org.yearup.models.Category;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlCategoryDao extends MySqlDaoBase implements CategoryDao
{
    public MySqlCategoryDao(DataSource dataSource)
    {
        super(dataSource);
    }

    @Override
    public List<Category> getAllCategories()
    {
        // get all categories
        List<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM Categories;";

        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                Category category = new Category();
                category.setCategoryId(rows.getInt("Category_ID"));
                category.setName(rows.getString("Name"));
                category.setDescription(rows.getString("description"));
                categories.add(category);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } return categories;
    }

    @Override
    public Category getById(int categoryId)
    {
        // get category by id
        try(Connection connection = dataSource.getConnection()){
            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM categories WHERE category_id = ?")) {
                preparedStatement.setInt(1, (categoryId));
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return mapRow(resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;    }

    @Override
    public Category create(Category category)
    {
        // create a new category
        int id = category.getCategoryId();
        String name = category.getName();
        String description = category.getDescription();
        String query = "INSERT INTO categories (category_id, Name, Description) VALUES (?, ?, " +
                "?);";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, description);
            int rows = statement.executeUpdate();
            System.out.println("Rows updated "+rows);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return category;
    }

    @Override
    public void update(int categoryId, Category category)
    {
        // update category
        String query = "UPDATE category SET category_id = ?, Name = ?, Description=? " ;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1,categoryId);
            statement.setString(2, category.getName());
            statement.setString(3, category.getDescription());
            int rows = statement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int categoryId)
    {
        // delete category
        String query = "DELETE FROM category WHERE category_ID = ?;";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1, categoryId);
            int rows = statement.executeUpdate();
            System.out.println("Category deleted "+rows);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private Category mapRow(ResultSet row) throws SQLException
    {
        int categoryId = row.getInt("category_id");
        String name = row.getString("name");
        String description = row.getString("description");

        Category category = new Category()
        {{
            setCategoryId(categoryId);
            setName(name);
            setDescription(description);
        }};

        return category;
    }

}
