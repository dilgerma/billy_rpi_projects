package de.effectivetrainings.times.adapter.rest.customers;

import de.effectivetrainings.times.adapter.rest.Mapper;
import de.effectivetrainings.times.api.Address;
import de.effectivetrainings.times.adapter.db.customer.AddressData;

public class CustomerAddressMapper implements Mapper<Address, AddressData> {

    @Override
    public Address from(AddressData addressData) {
        return Address
                .builder()
                .city(addressData.getCity())
                .zip(addressData.getZip())
                .street(addressData.getStreet())
                .houseNumber(addressData.getHouseNumber())
                .build();
    }

    @Override
    public AddressData to(Address address) {
        return new AddressData(address.getStreet(), address.getHouseNumber(), address.getZip(), address.getCity());
    }
}
