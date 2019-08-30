DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI[arm-fb.md5sum] = "a579848d10388b0e9e8ecd0f25d31dbc"
SRC_URI[arm-fb.sha256sum] = "8994b8e4e4f0cb84eaa3434a6e95592ad0586ada7507fa158db3b3d402a122d0"

SRC_URI[arm-wayland.md5sum] = "6013a12a49fcded76690e531c8020663"
SRC_URI[arm-wayland.sha256sum] = "f92e26d391fab968b5f3add2f4922cd01a930c6264fb25442abf4984b1ecf7ef"

SRC_URI[arm-x11.md5sum] = "f06bf71bc6f95b6a80f9d3c2dfc6a0d5"
SRC_URI[arm-x11.sha256sum] = "8255d87b42de19d3d24ed00e6a7101f816cf6e648fe9850705748071c5867bbf"

SRC_URI[aarch64-fb.md5sum] = "3fdc1caadbfe10f3b412f10d832d936f"
SRC_URI[aarch64-fb.sha256sum] = "eebc1c18c0a27b6c5e76a6850fac8573fc66c6cf6847b01ffec4b2e8a56c26ef"

SRC_URI[aarch64-wayland.md5sum] = "1328badf3845235f3afaa83fc589a851"
SRC_URI[aarch64-wayland.sha256sum] = "0198e1e4b490a04609eb1ac73a975d2a70354588a1014300f11a69f8f79100c5"

SRC_URI[aarch64-x11.md5sum] = "021d2e5e31edb85b1be72163bf911bcc"
SRC_URI[aarch64-x11.sha256sum] = "8f9ca4bd2da4b06eb678a989848540d52e67e782b209c82e5e2ffeed057ce762"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
