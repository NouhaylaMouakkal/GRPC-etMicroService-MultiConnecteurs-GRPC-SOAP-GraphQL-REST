package ma.enset.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Bank;
import ma.enset.stubs.BankServiceGrpc;

import java.io.IOException;

public class BankGrpcClient2 {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceStub bankServiceStub = BankServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrencyRequest request = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("USD")
                .setAmount(6500)
                .build();
bankServiceStub.convert(request, new StreamObserver<Bank.ConvertCurrencyResponse>() {
    @Override
    public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
        System.out.println(convertCurrencyResponse);
    }

    @Override
    public void onError(Throwable throwable) {
System.out.println(throwable.getMessage());
    }

    @Override
    public void onCompleted() {
System.out.println("END");
    }
});
System.in.read();
    }
}
