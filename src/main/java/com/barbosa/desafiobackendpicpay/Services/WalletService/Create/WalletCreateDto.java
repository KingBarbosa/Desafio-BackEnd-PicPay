package com.barbosa.desafiobackendpicpay.Services.WalletService.Create;

import com.barbosa.desafiobackendpicpay.Entities.Wallet.WalletTypeEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class WalletCreateDto {

    @NotEmpty(message = "Field Cannot Be Empty")
    private String fullName;

    @NotEmpty(message = "Field Cannot Be Empty")
    private String cpfOrcnpj;

    @NotEmpty(message = "Field Cannot Be Empty")
    @Email(message = "Invalid Email")
    private String email;

    @NotEmpty(message = "Field Cannot Be Empty")
    @Size(min = 8, max = 64, message = "Password must be between 8 and 64 characters")
    private String password;

    @NotNull(message = "Field Cannot Be Null")
    private WalletTypeEnum walletType;
}
