package lk.ijse.payment_service.service;

import lk.ijse.payment_service.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    PaymentDTO createPayment(PaymentDTO paymentDTO);
    PaymentDTO getPaymentById(Long id);
    List<PaymentDTO> getAllPayments();
    void deletePayment(Long id);
}
