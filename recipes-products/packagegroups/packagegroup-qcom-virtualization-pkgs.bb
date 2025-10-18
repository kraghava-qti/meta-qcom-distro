SUMMARY = "Qualcomm virtualization packagegroup"
DESCRIPTION = "Package group to bring in packages required for virtualization"

PACKAGES = "${PN}"

inherit packagegroup

PACKAGES += " \
    libvirt \
    libvirt-libvirtd \
    libvirt-virsh \
    qemu \
    "