package com.example.Bank.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import practice.dto.BankRequestDto;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class BankControllerTest {
    private final BankRequestDto bankRequestDto=new BankRequestDto();
    private MockMvc mockMvc;
    @InjectMocks
    private BankController bankController;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(bankController).build();}
    @Test
    void create() {
    }

    @Test
    void getAllBanks() {
    }

    @Test
    void getBankById() {
    }

    @Test
    void deleteBankById() {
    }

    @Test
    void post_invalidName() throws Exception
    {
        bankRequestDto.setName(null);
        mockMvc.perform(post("/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(bankRequestDto)))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("dsrdsdsf"));
    }
}